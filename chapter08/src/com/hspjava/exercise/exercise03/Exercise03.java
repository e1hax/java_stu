package com.hspjava.exercise.exercise03;

public class Exercise03 {
    public static void main(String[] args) {
        Teacher professor = new Professor("Tom",78,"教授",5000,1.3);
        Teacher assprofessor = new AssProfessor("Jason",66,"副教授",5000,1.2);
        Teacher lecturer = new Lecturer("Tom",38,"讲师",5000,1.1);

        professor.introduce();
        assprofessor.introduce();
        lecturer.introduce();
    }
}

