package com.example.Library.Service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);

}