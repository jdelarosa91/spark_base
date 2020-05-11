import jdelarosa91.spark.base.SparkApp

object App extends SparkApp {

  val text = spark.sparkContext.parallelize(Seq("abc bca abc", "bca aaa bbb"))

  val countWords = text.flatMap(_.split(" "))
    .map(word => (word, 1))
    .reduceByKey(_+_)
    .collect()
  countWords.foreach(println)
}