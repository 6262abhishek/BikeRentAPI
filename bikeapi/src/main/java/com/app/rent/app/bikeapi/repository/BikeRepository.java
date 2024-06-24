package com.app.rent.app.bikeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.rent.app.bikeapi.model.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
