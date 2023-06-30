package day18;

import java.io.FileReader;

public class Example09 {
    public static void main(String[] args) {
        //FileReader를 이용하여 파일 읽기.
        FileReader fin = null;
        try {
            //경로상에 텍스트문서 파일을 열고 파일과 입력 바이트 스트림 객체.
            //fin 연결
            fin = new FileReader("C:\\Upload2");//파일 경로
            int c;
            // 파일 끝까지 한 바이트씩 c에 읽어 들임
            // 파일의 끝을 만나면 read()는 -1 을 리턴
            while ((c = fin.read()) != -1){
                // 바이트c를 문자로 반환하여 화면에 출력
                System.out.println((char) c);
            }
            fin.close();
        }catch (Exception e){

        }
    }
}
