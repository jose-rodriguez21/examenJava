package main;

import java.time.LocalDate;
import java.util.List;

public class Course {

    private String nameCurso;
    private int hours;
    private double score;
    private LocalDate dateFinish;

    public String getNameCurso() {
        return nameCurso;
    }

    public void setNameCurso(String nameCurso) {
        this.nameCurso = nameCurso;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public LocalDate getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(LocalDate dateFinish) {
        this.dateFinish = dateFinish;
    }

    public Course(List<String> listInit) {
        this.nameCurso = listInit.get(0);
        this.hours = Integer.parseInt(listInit.get(1));
        this.score = Double.parseDouble(listInit.get(2));
        this.dateFinish = LocalDate.parse(listInit.get(3));
    }

    @Override
    public String toString() {
        return  "Nombre del curso: '" + nameCurso + '\'' +
                ", Horas: " + hours +
                ", Calificación: " + score +
                ", Fecha: " + dateFinish;
    }

}
