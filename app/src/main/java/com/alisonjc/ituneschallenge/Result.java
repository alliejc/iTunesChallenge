
package com.alisonjc.ituneschallenge;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Result {

    @SerializedName("artistId")
    @Expose
    private Long ArtistId;
    @SerializedName("artistName")
    @Expose
    private String ArtistName;
    @SerializedName("artistViewUrl")
    @Expose
    private String ArtistViewUrl;
    @SerializedName("artworkUrl100")
    @Expose
    private String ArtworkUrl100;
    @SerializedName("artworkUrl30")
    @Expose
    private String ArtworkUrl30;
    @SerializedName("artworkUrl60")
    @Expose
    private String ArtworkUrl60;
    @SerializedName("collectionCensoredName")
    @Expose
    private String CollectionCensoredName;
    @SerializedName("collectionExplicitness")
    @Expose
    private String CollectionExplicitness;
    @SerializedName("collectionId")
    @Expose
    private Long CollectionId;
    @SerializedName("collectionName")
    @Expose
    private String CollectionName;
    @SerializedName("collectionPrice")
    @Expose
    private Double CollectionPrice;
    @SerializedName("collectionViewUrl")
    @Expose
    private String CollectionViewUrl;
    @SerializedName("country")
    @Expose
    private String Country;
    @SerializedName("currency")
    @Expose
    private String Currency;
    @SerializedName("discCount")
    @Expose
    private Long DiscCount;
    @SerializedName("discNumber")
    @Expose
    private Long DiscNumber;
    @SerializedName("isStreamable")
    @Expose
    private Boolean IsStreamable;
    @SerializedName("kind")
    @Expose
    private String Kind;
    @SerializedName("previewUrl")
    @Expose
    private String PreviewUrl;
    @SerializedName("primaryGenreName")
    @Expose
    private String PrimaryGenreName;
    @SerializedName("releaseDate")
    @Expose
    private String ReleaseDate;
    @SerializedName("trackCensoredName")
    @Expose
    private String TrackCensoredName;
    @SerializedName("trackCount")
    @Expose
    private Long TrackCount;
    @SerializedName("trackExplicitness")
    @Expose
    private String TrackExplicitness;
    @SerializedName("trackId")
    @Expose
    private Long TrackId;
    @SerializedName("trackName")
    @Expose
    private String TrackName;
    @SerializedName("trackNumber")
    @Expose
    private Long TrackNumber;
    @SerializedName("trackPrice")
    @Expose
    private Double TrackPrice;
    @SerializedName("trackTimeMillis")
    @Expose
    private Long TrackTimeMillis;
    @SerializedName("trackViewUrl")
    @Expose
    private String TrackViewUrl;
    @SerializedName("wrapperType")
    @Expose
    private String WrapperType;

    public Long getArtistId() {
        return ArtistId;
    }

    public void setArtistId(Long artistId) {
        ArtistId = artistId;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public void setArtistName(String artistName) {
        ArtistName = artistName;
    }

    public String getArtistViewUrl() {
        return ArtistViewUrl;
    }

    public void setArtistViewUrl(String artistViewUrl) {
        ArtistViewUrl = artistViewUrl;
    }

    public String getArtworkUrl100() {
        return ArtworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        ArtworkUrl100 = artworkUrl100;
    }

    public String getArtworkUrl30() {
        return ArtworkUrl30;
    }

    public void setArtworkUrl30(String artworkUrl30) {
        ArtworkUrl30 = artworkUrl30;
    }

    public String getArtworkUrl60() {
        return ArtworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
        ArtworkUrl60 = artworkUrl60;
    }

    public String getCollectionCensoredName() {
        return CollectionCensoredName;
    }

    public void setCollectionCensoredName(String collectionCensoredName) {
        CollectionCensoredName = collectionCensoredName;
    }

    public String getCollectionExplicitness() {
        return CollectionExplicitness;
    }

    public void setCollectionExplicitness(String collectionExplicitness) {
        CollectionExplicitness = collectionExplicitness;
    }

    public Long getCollectionId() {
        return CollectionId;
    }

    public void setCollectionId(Long collectionId) {
        CollectionId = collectionId;
    }

    public String getCollectionName() {
        return CollectionName;
    }

    public void setCollectionName(String collectionName) {
        CollectionName = collectionName;
    }

    public Double getCollectionPrice() {
        return CollectionPrice;
    }

    public void setCollectionPrice(Double collectionPrice) {
        CollectionPrice = collectionPrice;
    }

    public String getCollectionViewUrl() {
        return CollectionViewUrl;
    }

    public void setCollectionViewUrl(String collectionViewUrl) {
        CollectionViewUrl = collectionViewUrl;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Long getDiscCount() {
        return DiscCount;
    }

    public void setDiscCount(Long discCount) {
        DiscCount = discCount;
    }

    public Long getDiscNumber() {
        return DiscNumber;
    }

    public void setDiscNumber(Long discNumber) {
        DiscNumber = discNumber;
    }

    public Boolean getIsStreamable() {
        return IsStreamable;
    }

    public void setIsStreamable(Boolean isStreamable) {
        IsStreamable = isStreamable;
    }

    public String getKind() {
        return Kind;
    }

    public void setKind(String kind) {
        Kind = kind;
    }

    public String getPreviewUrl() {
        return PreviewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        PreviewUrl = previewUrl;
    }

    public String getPrimaryGenreName() {
        return PrimaryGenreName;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
        PrimaryGenreName = primaryGenreName;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getTrackCensoredName() {
        return TrackCensoredName;
    }

    public void setTrackCensoredName(String trackCensoredName) {
        TrackCensoredName = trackCensoredName;
    }

    public Long getTrackCount() {
        return TrackCount;
    }

    public void setTrackCount(Long trackCount) {
        TrackCount = trackCount;
    }

    public String getTrackExplicitness() {
        return TrackExplicitness;
    }

    public void setTrackExplicitness(String trackExplicitness) {
        TrackExplicitness = trackExplicitness;
    }

    public Long getTrackId() {
        return TrackId;
    }

    public void setTrackId(Long trackId) {
        TrackId = trackId;
    }

    public String getTrackName() {
        return TrackName;
    }

    public void setTrackName(String trackName) {
        TrackName = trackName;
    }

    public Long getTrackNumber() {
        return TrackNumber;
    }

    public void setTrackNumber(Long trackNumber) {
        TrackNumber = trackNumber;
    }

    public Double getTrackPrice() {
        return TrackPrice;
    }

    public void setTrackPrice(Double trackPrice) {
        TrackPrice = trackPrice;
    }

    public Long getTrackTimeMillis() {
        return TrackTimeMillis;
    }

    public void setTrackTimeMillis(Long trackTimeMillis) {
        TrackTimeMillis = trackTimeMillis;
    }

    public String getTrackViewUrl() {
        return TrackViewUrl;
    }

    public void setTrackViewUrl(String trackViewUrl) {
        TrackViewUrl = trackViewUrl;
    }

    public String getWrapperType() {
        return WrapperType;
    }

    public void setWrapperType(String wrapperType) {
        WrapperType = wrapperType;
    }

}
