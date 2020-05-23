package cat.saramtzalabart.tfg.myretrofit.service;

import java.util.List;

import cat.saramtzalabart.tfg.myretrofit.domini.Patient;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("Patient?_format=json&_pretty=true")
    Call<List<Patient>> getPatients();
}
