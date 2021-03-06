/*
 * Copyright (C) 2017-2018 Lightbend Inc. <http://www.lightbend.com>
 */

package akka.cluster.bootstrap

import akka.actor.ActorSystem
import akka.management.AkkaManagement
import akka.management.cluster.bootstrap.ClusterBootstrap

object Ec2DemoApp extends App {

  implicit val system = ActorSystem("demo")

  AkkaManagement(system).start()

  ClusterBootstrap(system).start()

}
