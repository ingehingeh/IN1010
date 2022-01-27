// Trix Uke 2: 02.07: Studenter og quiz-score

// a) Implementer klasse Student

class Student {
    private String navn;
    private int totalScore = 0;
    private int antQuiz = 0;

    public Student(String navn, int totalScore, int antQuiz) {
        this.navn = navn;
        this.totalScore = totalScore;
        this.antQuiz = antQuiz;
    }

    public String hentNavn() {
        return navn;
    }

    public void leggTilQuizScore(int score){
        totalScore += score;
        antQuiz+= 1;
    }

    public int hentTotalScore() {
        return totalScore;
    }

    public int hentAvgScore() {
        return totalScore/antQuiz;
    }






}