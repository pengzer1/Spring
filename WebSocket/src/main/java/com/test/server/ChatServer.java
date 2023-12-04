package com.test.server;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.google.gson.Gson;
import com.test.domain.Message;

@ServerEndpoint("/chatserver.do")
public class ChatServer {

	// 현재 채팅서버에 접속 중인 클라이언트 목록
	private static List<Session> sessionList = new ArrayList<Session>();
	
	// 클라이언트 접속
	@OnOpen
	public void handleOpen(Session session) {
		System.out.println("클라이언트가 접속했습니다.");
		
		sessionList.add(session); // 현재 접속자의 정보를 배열에 추가
		
		checkSessionList();
	}
	
	// 클라이언트로부터 메시지 전달
	@OnMessage
	public void handleMessage(String msg, Session session) {
		// System.out.println(msg);
		
		// JSON 형식의 문자열 -> 자바 클래스 객체로 변환
		Gson gson = new Gson();
		
		Message message = gson.fromJson(msg, Message.class);
		
		// System.out.println(message);
		// System.out.println(msg);
		
		if (message.getCode().equals("1")) {
			for (Session s : sessionList) {
				// 모든 접속자 중에서 방금 메시지를 보낸 세션을 제외하고 검색
				if (s != session) {
					// 본인 이외의 세션(소켓)에게 현재 접속자를 알리는 메시지 전달
					try {
						s.getBasicRemote().sendText(msg);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} else if (message.getCode().equals("2")) {
			// 기존잡속자가 대화방을 나갔습니다.
			sessionList.remove(session);
			for (Session s : sessionList) {
				try {
					s.getBasicRemote().sendText(msg);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		} else if (message.getCode().equals("3")) {
			for (Session s : sessionList) {
				if (s != session) { // 보낸 사람 빼고
					try {
						s.getBasicRemote().sendText(msg);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} else if (message.getCode().equals("4")) {
			for (Session s : sessionList) {
				if (s != session) { // 보낸 사람 빼고
					try {
						s.getBasicRemote().sendText(msg);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	private void checkSessionList() {
		System.out.println("Session List");
		for (Session session : sessionList) {
			System.out.println(session.getId());
		}
		System.out.println();
	}
	
}
