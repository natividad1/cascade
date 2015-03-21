package com.paypal.cascade.http.server

import spray.can.server.Stats

object StatsResponse {
  def apply(s: Stats): StatsResponse = {
    StatsResponse(
      s.uptime.toSeconds,
      s.totalRequests,
      s.openRequests,
      s.maxOpenRequests,
      s.totalConnections,
      s.openConnections,
      s.maxOpenConnections,
      s.requestTimeouts)
  }
}

/**
 * Container for the information generated by a `stats` endpoint request
 */
case class StatsResponse(
  uptimeInSec: Long,
  totalRequests: Long,
  openRequests: Long,
  maxOpenRequests: Long,
  totalConnections: Long,
  openConnections: Long,
  maxOpenConnections: Long,
  requestTimeouts: Long)
