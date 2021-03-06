package kz.mounty.fm.domain.track

import kz.mounty.fm.domain.DomainEntity

/**
 * @param id          unique id of the RoomTrack.
 * @param trackId     id of the track.
 * @param roomId      id of the room the track is being played in.
 * @param trackTitle  name of the track.
 * @param trackAuthors name of the author of the track.
 * @param picUrl      url of the main picture of the track.
 */

case class RoomTrack(id: String,
                     trackId: String,
                     roomId: String,
                     trackTitle: String,
                     trackAuthors: Seq[String],
                     duration: Int,
                     picUrl: Option[String] = None) extends DomainEntity
