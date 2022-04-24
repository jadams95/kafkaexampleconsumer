package com.example.kafkaexampleconsumer.repository;

import com.example.kafkaexampleconsumer.beans.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder, Long> {
}
