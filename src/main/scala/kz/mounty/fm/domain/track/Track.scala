package kz.mounty.fm.domain.track

import kz.mounty.fm.domain.DomainEntity

case class Track(id: String,
                 imageUrl: String,
                 spotifyUri: String,
                 artists: Seq[String],
                 name: String,
                 progressMs: Option[Int] = None,
                 duration: Int) extends DomainEntity
