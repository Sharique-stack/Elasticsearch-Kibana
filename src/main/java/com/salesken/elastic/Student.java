package com.salesken.elastic;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "Students")
public class Student {

    @Id
    private String id;

    @Field(type = FieldType.Text, name = "Student")
    private String name;

    @Field(type = FieldType.Text, name = "English I")
    private String EnglishI;
    @Field(type = FieldType.Text, name = "Maths I")
    private String MathsI;
    @Field(type = FieldType.Text, name = "Science I")
    private double ScienceI;

    @Field(type = FieldType.Text, name = "English II")
    private String EnglishII;

    @Field(type = FieldType.Text, name = "Maths II")
    private String MathsII;

    @Field(type = FieldType.Text, name = "Science II")
    private String ScienceII;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishI() {
        return EnglishI;
    }

    public void setEnglishI(String englishI) {
        EnglishI = englishI;
    }

    public String getMathsI() {
        return MathsI;
    }

    public void setMathsI(String mathsI) {
        MathsI = mathsI;
    }

    public double getScienceI() {
        return ScienceI;
    }

    public void setScienceI(double scienceI) {
        ScienceI = scienceI;
    }

    public String getEnglishII() {
        return EnglishII;
    }

    public void setEnglishII(String englishII) {
        EnglishII = englishII;
    }

    public String getMathsII() {
        return MathsII;
    }

    public void setMathsII(String mathsII) {
        MathsII = mathsII;
    }

    public String getScienceII() {
        return ScienceII;
    }

    public void setScienceII(String scienceII) {
        ScienceII = scienceII;
    }
}
