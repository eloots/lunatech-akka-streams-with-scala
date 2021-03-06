package org.applied.akkastreams.substreams

sealed trait SignalType
case object Velocity extends SignalType
case object Ignition extends SignalType

case class Signal(vin: Int, signalType: SignalType, value: Double)
