package jdelarosa91.spark.base

import org.apache.spark.sql.SparkSession

trait SparkApp extends App {

  implicit lazy val spark = {
    val session =
      SparkSession
        .builder
        // .enableHiveSupport
        .getOrCreate

    // session.sqlContext.setConf("hive.exec.dynamic.partition", "true")
    // session.sqlContext.setConf("hive.exec.dynamic.partition.mode", "nonstrict")

    session
  }
}
