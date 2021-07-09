package com.vitthalmirji.spring;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class MOD {
    private SparkSession sparkSession;
    public Dataset<Row> DataFrame;
    static ArrayList<String> final_list = new ArrayList<String>();
    static Map<String, Integer> mapp = new HashMap();

    public MOD(SparkSession sparkSession) {
        DataFrame = sparkSession.read().option("header", "true").option("treatEmptyValuesAsNulls", "true").option("delimiter", ",").csv("src/main/resources/Wuzzuf_Jobs.csv");
        DataFrame.dropDuplicates();
        DataFrame.na().drop();
    }
    public Dataset<Row> Summary1(){
        return DataFrame.summary();
    }
}
