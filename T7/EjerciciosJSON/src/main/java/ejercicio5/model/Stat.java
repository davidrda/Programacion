package ejercicio5.model;


import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Stat {

    @SerializedName("base_stat")
    private int baseStat;

    private StatInfo stat;

}
