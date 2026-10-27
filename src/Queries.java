
public class Queries {
    static String todo = "SELECT * FROM mediciones";
    static String clave_staciones = "SELECT clave FROM estaciones";
    static String por_estacion = "SELECT  * FROM mediciones WHERE estaciones_clave = '%s' ORDER BY instante ";
    static String por_periodo = "SELECT * FROM mediciones WHERE DATE(instante) BETWEEN '%s' AND '%s' ";
    static String promedio = "SELECT estaciones_clave AS estacion, MONTH(instante)AS mes, AVG(temperatura)AS temperatura_prom "
            + "FROM mediciones WHERE estaciones_clave = '%s' GROUP BY MONTH(instante)";
    static String max_min_semana = "SELECT estaciones_clave AS estacion, WEEK(instante)AS semana, ROUND(MIN(precipitacion),2) AS precipitacion_mini, ROUND(MAX(precipitacion),2) AS precipitacion_max FROM mediciones WHERE estaciones_clave = '%s' GROUP BY WEEK(instante);";
    static String hoy = "SELECT * FROM mediciones WHERE DATE(instante) = CURRENT_DATE AND estaciones_clave = '%s';";
    
    
}
