package cat.saramtzalabart.tfg.myretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import cat.saramtzalabart.tfg.myretrofit.domini.Patient;
import cat.saramtzalabart.tfg.myretrofit.service.JsonPlaceHolderApi;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tv_result);

        //Gson gson = new GsonBuilder().serializeNulls().create();

        /*OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.addInterceptor(new AuthInterceptor());
        OkHttpClient client = okHttpClientBuilder.build();*/
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://vws15459.dinaserver.com:8087/baseDstu3/")
                .addConverterFactory(GsonConverterFactory.create())//gson
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<Patient>> call = jsonPlaceHolderApi.getPatients();

        call.enqueue(new Callback<List<Patient>>() {
            @Override
            public void onResponse(Call<List<Patient>> call, Response<List<Patient>> response) {
                if(!response.isSuccessful()){
                    //etName.setText("Code: " + response.code());
                    Toast.makeText(MainActivity.this, response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }

                List<Patient> patients = response.body();

                for (Patient patient: patients){
                    String content = "";
                    content += "Name: " + patient.getName().getName() +"\n";
                    content += "Surname: " + patient.getName().getSurname() +"\n";
                    content += "Gender: " + patient.getGender() +"\n";
                    content += "Birth Date: " + patient.getBirthDate().toString() +"\n";
                    content += "DNI: " + patient.getIdentifier().getDni() +"\n\n";
                    tvResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Patient>> call, Throwable t) {
                tvResult.setText(t.getMessage());
            }
        });
    }
}
