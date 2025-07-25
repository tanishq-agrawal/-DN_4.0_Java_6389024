import React, { Component } from 'react';
import Cart from './Cart';

class OnlineShopping extends Component {
  render() {
    const items = [
      { Itemname: 'Laptop', Price: 80000 },
      { Itemname: 'TV', Price: 120000 },
      { Itemname: 'Washing Machine', Price: 50000 },
      { Itemname: 'Mobile', Price: 30000 },
      { Itemname: 'Fridge', Price: 70000 }
    ];

    return (
      <div style={{ textAlign: 'center' }}>
        <h2 style={{ color: 'green' }}>Items Ordered :</h2>
        <table border="1" style={{ margin: 'auto' }}>
          <thead>
            <tr>
              <th>Name</th>
              <th>Price</th>
            </tr>
          </thead>
          <tbody>
            {items.map((item, index) => (
              <Cart
                key={index}
                Itemname={item.Itemname}
                Price={item.Price}
              />
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default OnlineShopping;