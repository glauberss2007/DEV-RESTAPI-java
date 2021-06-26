package com.beerstockapi.mapper;

import com.beerstockapi.dto.BeerDTO;
import com.beerstockapi.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {
    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);
    Beer toModel(BeerDTO beerDTO);
    BeerDTO toDTO(Beer beer);
}
