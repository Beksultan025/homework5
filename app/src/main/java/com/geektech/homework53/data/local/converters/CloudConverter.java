package com.geektech.homework53.data.local.converters;

import androidx.room.TypeConverter;

import com.geektech.homework53.data.model.Fotografy;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class CloudConverter {
    @TypeConverter
    public String fromCloudsToString(Fotografy fotografy){
        Gson gson = new Gson();
        Type type = new TypeToken<Fotografy>(){}.getType();
        return gson.toJson(fotografy,type);
    }
    @TypeConverter
    public Fotografy fromStringToClouds(String fromString){
        Gson gson = new Gson();
        Type type = new TypeToken<Fotografy>(){}.getType();
        return gson.fromJson(fromString,type);
    }
}
