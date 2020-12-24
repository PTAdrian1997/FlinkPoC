package mp.y2.sem1.bda.flinkpoc
package application
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment
import org.apache.flink.streaming.api.datastream.DataStream

object MainObject extends App {

  case class Person(name: String, age: Integer)

  val environment: StreamExecutionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment

  val flintstones: DataStream[Person] = environment.fromElements(
    Person("Fred", 35), Person("Wilma", 35), Person("Pebbles", 2)
  )

  val adults: DataStream[Person] = flintstones.filter(person1 => person1.age >= 18)

  adults.print()

  environment.execute()

}
