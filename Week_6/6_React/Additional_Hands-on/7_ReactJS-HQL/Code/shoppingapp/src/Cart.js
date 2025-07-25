import React, { Component } from 'react';

class Cart extends Component {
  render() {
    return (
      <tr>
        <td>{this.props.Itemname}</td>
        <td>{this.props.Price}</td>
      </tr>
    );
  }
}

export default Cart;