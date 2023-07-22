package com.Digital.Digital.Service.Impl.ProductsImpl;

import com.Digital.Digital.Entity.Products.Price;
import com.Digital.Digital.Infrastructure.Dto.Products.PriceDto;
import com.Digital.Digital.Infrastructure.Mapper.ProductsDtoMapper.PriceDtoMapper;
import com.Digital.Digital.Infrastructure.Mapper.ProductsDtoMapper.PriceMapper;
import com.Digital.Digital.Repository.ProductsRepository.PriceRepository;
import com.Digital.Digital.Service.ProductsService.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceImpl implements PriceService {

    @Autowired
    private PriceRepository priceRepository;

    @Override
    public PriceDto savePrice(PriceDto priceDto) {
        Price price = PriceMapper.INSTANCE.apply(priceDto);
        Price savePrice = priceRepository.save(price);
        return PriceDtoMapper.INSTANCE.apply(savePrice);
    }
}
