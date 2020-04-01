package com.profemzy.photoappapialbums.api.albums.service;

import com.profemzy.photoappapialbums.api.albums.data.AlbumEntity;

import java.util.List;

public interface AlbumsService {
    List<AlbumEntity> getAlbums(String userId);
}
