public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

// mat2 fizik2 ve kimya2 bu derslerin sözlü notlarını ifade etmektedir.

    public void addBulkExamNote(int mat, int mat2, int fizik, int fizik2, int kimya, int kimya2) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (mat2 >= 0 && mat2 <= 100) {
            this.mat.soznot = mat2;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (fizik2 >= 0 && fizik2 <= 100) {
            this.fizik.soznot = fizik2;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (kimya2 >= 0 && kimya2 <= 100) {
            this.kimya.soznot = kimya2;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    // sınav notlarının etki oranı %80, sözlü notlarının etki oranı %20 olarak alınmıştır.

    public void calcAvarage() {
        this.avarage = (this.fizik.note * 0.8 + this.fizik.soznot * 0.2 +
                this.kimya.note * 0.8 + this.kimya.soznot * 0.2 +
                this.mat.note * 0.8 + this.mat.soznot * 0.2) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
