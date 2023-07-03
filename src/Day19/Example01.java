package Day19;

import java.io.File;

public class Example01 {
    /*
    * File 클래스
    * File 클래스는 입출력에 필요한 파일 및 디렉톨리에 관한 정보를 다룰 수 있다.
    * - File 클래스는 새로운 파일과 디렉토리 생성 및 삭제, 이름 변경 등의 조작
    * 메소드를 가지고 있다.
    * */
    public static void main(String[] args) {
        File file = new File("C:\\upload");
        if (file.exists()){
            try {
                //파일 이름을 표시
                System.out.println("getName : " + file.getName());
                //파일 경로를 표시
                System.out.println("getPath : " + file.getPath());
                //파일 절대 경로를 표시
                System.out.println("getAbsolutePath : " + file.getAbsolutePath());
                //상위 디렉토리 표시
                System.out.println("getAbsolutePath : " + file.getParent());

                if (file.canWrite()){//쓰기 권한 체크
                    System.out.println(file.getName()+" 쓰기 가능");
                }
                if (file.canWrite()){//읽기 권한 체크
                    System.out.println(file.getName() + " 읽기 가능");
                }
                if (file.isFile()){//파일인지 디렉토리인지 검사.
                    System.out.println(file.getName()+" is file");
                }
                if (file.isDirectory()){
                    System.out.println(file.getName() + " is directory");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
