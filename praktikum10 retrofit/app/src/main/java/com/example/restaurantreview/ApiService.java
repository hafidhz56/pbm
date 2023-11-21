package com.example.restaurantreview;

    import retrofit2.Call;
    import retrofit2.http.*;
    interface ApiService {
        @GET("detail/{id}")
        Call<RestaurantResponse> getRestaurant(@Path("id") String id);
    }
