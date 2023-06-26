package dya16;

import javax.swing.*;

public class SwingTest extends JFrame {
    /*
    * GUI 응용프로그램
    * - Graphical User Interface 의 약자로 이미지 혹은 그래픽을
    * 이용 하여 메뉴 등 을 포함 하는 화면을 구성 하고 , 키보드와 마우스 등의
    * 편리한 입력 도구를 사용하여 사용자가 입력을 편리하게 사용할 수 있도록 작성하는 인터페이스
    * -자바는 AWT 와 Swing 패키지를 제공하여 Gui 를 쉽게 구성하도록 해줌
    * AWT
    * - 해당 시스템에서 실행될 시 해당 컴포넌트를 사용하는 GUI
    *
    * Swing
    * - 자바 에서 지원해주기 때문에 어디서든 동일 모양으로 나타내 다른
    * 운영체제라도 일관된 화면을 보여줄 수 있다.
    **/
    public SwingTest(){
        setVisible(true);//창을 눈에 보이도록 함
        setSize(640,480);// 창 사이즈
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new SwingTest();
    }
}
