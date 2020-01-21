package com.company;

import java.util.ArrayList;

public class PhotoAlbum implements PhotoTool{
    ArrayList<Photo> photos = new ArrayList<>();

    @Override
    public String giveNameToPhotoByIndex(int index) {
        return photos.get(index).toString();
    }

    @Override
    public void addPhoto() {
        Photo photo = new Photo();
        photos.add(photo);
    }

    public PhotoAlbum() {
    }

    public PhotoAlbum(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoAlbum that = (PhotoAlbum) o;

        return photos != null ? photos.equals(that.photos) : that.photos == null;
    }

    @Override
    public int hashCode() {
        return photos != null ? photos.hashCode() : 0;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    @Override
    public void printQuantityOfPhotos() {
        System.out.println(photos.size());
    }
}
