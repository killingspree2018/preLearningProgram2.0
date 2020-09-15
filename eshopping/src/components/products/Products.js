import { MDBContainer, MDBRow, MDBCol } from "mdbreact";
import ProductItem from "./ProductItem";
import React from "react";

function Products() {
  const products = [
    {
      imgURL:
        "https://www.dhresource.com/0x0/f2/albu/g8/M00/00/0D/rBVaV1zU_1CAGe1zAAfW0OjgeME205.jpg",
      name: "Black Denim Jacket",
      price: "99.99",
      sale: true,
    },
    {
      imgURL:
        "https://www.olymp.com/medias/55063663-pv-main.jpeg-olymp-1412x1400?context=bWFzdGVyfGltYWdlc3wyNDcyMDR8aW1hZ2UvanBlZ3xpbWFnZXMvaDAzL2gwNi85MzM3ODkwNjY4NTc0LmpwZ3xhZmMwMWQzNzkwYmQ2MmY4NTEyNGZmMmQ5OWEwODI5YzhiZDFiZWY4ZWFhM2VhY2IwYmYyYjVlNTQyMDNkZDY0",
      name: "Grey Sweater",
      price: "21.99",
      sale: true,
    },
    {
      imgURL:
        "https://ae01.alicdn.com/kf/HTB1866uX5rEK1JjSZFHq6AveXXaB/New-Brand-Denim-Jeans-Shirts-Men-Body-Pocket-Casual-Stand-Collar-Shirts-Long-Sleeves-Men-Shirts.jpg",
      name: "Blue Denim Shirt",
      price: "17.99",
      sale: true,
    },
    {
      imgURL:
        "https://ae01.alicdn.com/kf/HTB1866uX5rEK1JjSZFHq6AveXXaB/New-Brand-Denim-Jeans-Shirts-Men-Body-Pocket-Casual-Stand-Collar-Shirts-Long-Sleeves-Men-Shirts.jpg",
      name: "Blue Denim Shirt",
      price: "17.99",
      sale: true,
    },

    {
      imgURL:
        "https://i.pinimg.com/564x/be/79/b1/be79b103e6199d0942009b47014dd1ec.jpg",
      name: "Red Hoodie",
      price: "35.99",
      sale: true,
    },
    {
      imgURL:
        "https://www.olymp.com/medias/55063663-pv-main.jpeg-olymp-1412x1400?context=bWFzdGVyfGltYWdlc3wyNDcyMDR8aW1hZ2UvanBlZ3xpbWFnZXMvaDAzL2gwNi85MzM3ODkwNjY4NTc0LmpwZ3xhZmMwMWQzNzkwYmQ2MmY4NTEyNGZmMmQ5OWEwODI5YzhiZDFiZWY4ZWFhM2VhY2IwYmYyYjVlNTQyMDNkZDY0",
      name: "Grey Sweater",
      price: "21.99",
      sale: true,
    },
    {
      imgURL:
        "https://i.pinimg.com/564x/be/79/b1/be79b103e6199d0942009b47014dd1ec.jpg",
      name: "Red Hoodie",
      price: "35.99",
      sale: true,
    },
    {
      imgURL:
        "https://ae01.alicdn.com/kf/HTB1866uX5rEK1JjSZFHq6AveXXaB/New-Brand-Denim-Jeans-Shirts-Men-Body-Pocket-Casual-Stand-Collar-Shirts-Long-Sleeves-Men-Shirts.jpg",
      name: "Blue Denim Shirt",
      price: "17.99",
      sale: true,
    },
    {
      imgURL:
        "https://www.dhresource.com/0x0/f2/albu/g8/M00/00/0D/rBVaV1zU_1CAGe1zAAfW0OjgeME205.jpg",
      name: "Black Denim Jacket",
      price: "99.99",
      sale: true,
    },
  ];
  return (
    <MDBContainer>
      <MDBRow>
        {products.map((product) => (
          <MDBCol size='4'>
            <ProductItem product={product} />
          </MDBCol>
        ))}
      </MDBRow>
    </MDBContainer>
  );
}

export default Products;
