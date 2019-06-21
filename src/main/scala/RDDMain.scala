import org.apache.spark.{SparkConf, SparkContext}

object RDDMain {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf(true)
    val sc = new SparkContext(conf)
    var counter = 0
    val rdd = sc.parallelize(Seq(1 to 100))
    rdd.foreach(println)
    sc.broadcast()

  }
}
