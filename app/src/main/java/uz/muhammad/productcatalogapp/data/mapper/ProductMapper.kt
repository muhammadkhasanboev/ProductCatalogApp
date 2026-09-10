package uz.muhammad.productcatalogapp.data.mapper

import uz.muhammad.productcatalogapp.data.model.Product
import uz.muhammad.productcatalogapp.data.remote.dto.ProductDto
import uz.muhammad.productcatalogapp.data.remote.dto.ProductListResponseDto

fun ProductDto.toDomain(): Product = Product(
    id = id,
    title = title,
    description = description,
    price = price,
    discountPercentage = discountPercentage,
    rating = rating,
    thumbnail = thumbnail,
    images = images
)

fun ProductListResponseDto.toDomain(): List<Product> = products.map { it.toDomain() }
