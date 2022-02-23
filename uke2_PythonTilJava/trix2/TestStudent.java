// Trix Uke 2: 02.07: Studenter og quiz-score
// c) Opprett en ny klasse med en main-metode.

class TestStudent {
    public static void main(String[] args) {

        Student joakim = new Student("Joakim Hansen", 0, 0);
        Student kristin = new Student("Kristin Hansen", 0, 0);
        Student dag = new Student("Dag Hansen", 0, 0);

        joakim.leggTilQuizScore(2);
        kristin.leggTilQuizScore(5);
        dag.leggTilQuizScore(10);

        joakim.leggTilQuizScore(2);
        kristin.leggTilQuizScore(5);
        dag.leggTilQuizScore(10);

        System.out.println("Joakim score: " + joakim.hentTotalScore() 
        + ", Avg. score: " + joakim.hentAvgScore());
        System.out.println("Kristin score: " + kristin.hentTotalScore() 
        + ", Avg. score: " + kristin.hentAvgScore());
        System.out.println("Dag score: " + dag.hentTotalScore() 
        + ", Avg. score: " + dag.hentAvgScore());

    }
}