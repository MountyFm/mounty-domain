package kz.mounty.fm.domain.spotify.gateway

import kz.mounty.fm.domain.DomainEntity

case class SpotifyPlaylist(id: String,
                           name: String,
                           images: Seq[Image],
                           tracks: SpotifyTracks,
                           public: Boolean) extends DomainEntity
