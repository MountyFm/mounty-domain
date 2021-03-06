package kz.mounty.fm.domain.requests

import kz.mounty.fm.domain.DomainEntity
import kz.mounty.fm.domain.user.RoomUser

case class CreateRoomUserIfNotExistRequestBody(profileId: String, roomId: String) extends DomainEntity

case class CreateRoomUserIfNotExistResponseBody(roomUser: RoomUser) extends DomainEntity
