package bitlap.sbt.analyzer.parser

import java.util.List as JList

import bitlap.sbt.analyzer.model.*
import bitlap.sbt.analyzer.model.Dependency

import com.intellij.openapi.externalSystem.model.project.dependencies.*

/** @author
 *    梦境迷离
 *  @version 1.0,2023/8/3
 */
trait DependencyGraphBuilder {

  def buildDependencyTree(file: String): JList[DependencyNode]
  def toDependencyNode(dep: Dependency): DependencyNode

}
