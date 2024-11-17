package tn.esprit.jaidene_hachemi_dev.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.jaidene_hachemi_dev.entities.Stock;
import tn.esprit.jaidene_hachemi_dev.repositories.StockRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class StockServiceImpl implements IStockService {

    private StockRepository stockRepository;

    @Override
    public List<Stock> getStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock getStockById(Long id) {
        return stockRepository.findById(id).isPresent() ? stockRepository.findById(id).get() : null;
    }

    @Override
    public Stock createStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Stock updateStock(Stock stock, Long id) {
        if (stockRepository.findById(id).isPresent()) {
            return stockRepository.save(stock);
        }
        return null;
    }

    @Override
    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }
}
