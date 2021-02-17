package com.example.flora;

public class Constantes  {

    private  final static String URL_WEB_SERVICE = "https://secret-crag-59155.herokuapp.com/";

    public final static  String URL_INSERTAR_FLORA = URL_WEB_SERVICE + "Flora_INSERTAR_POST.php";
    public final static String URL_LISTAR_ESPECIES= URL_WEB_SERVICE + "Flora_GETALL.php";

    public final static String URL_INSERTAR_INSERTAR_CLASIFICACION_TAXONOMICA = URL_WEB_SERVICE + "ClasificacionTaxonomica_INSERTAR_POST.php";
    public final static String URL_LISTAR_CLASIFICACION= URL_WEB_SERVICE + "Clasificacion_GETALL.php";
}
