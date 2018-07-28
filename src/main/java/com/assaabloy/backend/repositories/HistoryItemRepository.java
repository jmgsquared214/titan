package com.assaabloy.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assaabloy.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
