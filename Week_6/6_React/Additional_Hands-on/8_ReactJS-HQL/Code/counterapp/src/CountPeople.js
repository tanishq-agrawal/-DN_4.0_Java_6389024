import React, { Component } from 'react';

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entrycount: 0,
      exitcount: 0
    };
  }

  UpdateEntry = () => {
    this.setState({ entrycount: this.state.entrycount + 1 });
  };

  UpdateExit = () => {
    this.setState({ exitcount: this.state.exitcount + 1 });
  };

  render() {
    return (
      <div style={{ display: 'flex', justifyContent: 'center', gap: '100px', marginTop: '100px' }}>
        <div>
          <button
            style={{ border: '2px solid green', backgroundColor: 'lightgreen', padding: '5px 10px' }}
            onClick={this.UpdateEntry}
          >
            Login
          </button>
          <span style={{ marginLeft: '10px' }}>{this.state.entrycount} People Entered!!!</span>
        </div>

        <div>
          <button
            style={{ border: '2px solid green', backgroundColor: 'lightgreen', padding: '5px 10px' }}
            onClick={this.UpdateExit}
          >
            Exit
          </button>
          <span style={{ marginLeft: '10px' }}>{this.state.exitcount} People Left!!!</span>
        </div>
      </div>
    );
  }
}

export default CountPeople;
