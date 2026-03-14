package ejercicio6.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;
@Data

public class Pregunta {

    private String type;
    private String difficulty;
    private String category;
    private String question;

    // Se pone como está en el JSON, y después se declara el atributo en camelCase
    @SerializedName("correct_answer")
    @Expose
    private String correctAnswer;

    @SerializedName("incorrect_answers")
    @Expose
    private List<String> incorrectAnswers;
}