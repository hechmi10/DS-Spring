package tn.esprit.jaidene_hachemi_dev.services;

import tn.esprit.jaidene_hachemi_dev.entities.Stock;

import java.util.List;

public interface IStockService {
    List<Stock> getStocks();
    Stock getStockById(Long id);
    Stock createStock(Stock stock);
    Stock updateStock(Stock stock,Long id);
    void deleteStock(Long id);
}
