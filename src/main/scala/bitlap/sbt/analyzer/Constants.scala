package bitlap.sbt.analyzer

import scala.concurrent.duration.*

/** @author
 *    梦境迷离
 *  @version 1.0,2023/8/10
 */
object Constants:

  final val Line_Separator: String = "\n"

  final val Colon_Separator: String = ":"
  final val Empty_String: String    = ""

  final val SingleSbtModule = "$SingleModule$"
  final val RootSbtModule   = "$RootModule$"

  final val Project = "project"

  final val Protobuf = "protobuf"

  final val timeout = 10.minutes

  final val intervalTimeout = 1010.milliseconds

  final val fileLifespan = 1000 * 60 * 60L

end Constants
