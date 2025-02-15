package com.example.urbanmarket.entity.cart;

import com.example.urbanmarket.dto.request.CartRequestDto;
import com.example.urbanmarket.dto.response.CartResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {
    CartResponseDto toResponseDto(CartEntity entity);

    CartEntity toEntity(CartResponseDto dto);
    CartEntity toEntity(CartRequestDto dto);

    List<CartResponseDto> toResponseDtoList (List<CartEntity> entities);
    List<CartEntity> toEntityList(List<CartResponseDto> dtos);
}
