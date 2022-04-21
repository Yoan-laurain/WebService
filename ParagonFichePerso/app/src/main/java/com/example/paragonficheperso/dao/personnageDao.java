package com.example.paragonficheperso.dao;

import android.os.Build;
import androidx.annotation.RequiresApi;
import com.example.paragonficheperso.MainActivity;
import com.example.paragonficheperso.dto.personnageDTO;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Request;

public class personnageDao
{

    @RequiresApi(api = Build.VERSION_CODES.Q)
    public static void GetAllMap(MainActivity myActivity)
    {
        RequestBody formBody = new FormBody.Builder()
                .add("command", "GetAllCharacters")
                .add("api_key",MainActivity.API_KEY)
                .build();

        Request request = new Request.Builder()
                .url(MainActivity.CONNEXION_API)
                .post(formBody)
                .build();

        OkHttpClient client = new OkHttpClient();

        client.newCall(request).enqueue(new okhttp3.Callback() {

            @Override
            public void onFailure(@NotNull okhttp3.Call call, @NotNull IOException e) {}

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException
            {
                String responseStr = Objects.requireNonNull(response.body()).string();

                if (!responseStr.equals("false") && !responseStr.equals(""))
                {
                    try
                    {
                        JSONArray jsonArrayCharacter = new JSONArray(responseStr);

                        HashMap<Integer, personnageDTO> characters = new HashMap<>();

                        for (int i = 0; i < jsonArrayCharacter.length(); i++)
                        {
                            JSONObject json = jsonArrayCharacter.getJSONObject(i);

                            personnageDTO myCharacter = personnageDTO.HydrateCharacter(json);

                            characters.put( myCharacter.getId() , myCharacter );
                        }

                        myActivity.ResponseCharacters(characters);
                    }
                    catch(JSONException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
