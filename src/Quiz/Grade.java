package Quiz;

public class Grade {
    int mat;
    int sci;
    int eng;
    Grade(int mat, int sci, int eng){
        this.mat = mat;
        this.sci = sci;
        this.eng = eng;
    }
    public int getAvg(){
        int avg = this.mat + this.sci + this.eng;
        return avg /3;
    }
}
