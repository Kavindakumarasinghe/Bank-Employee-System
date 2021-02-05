import React, { Component } from 'react';

class HeaderComponent extends Component {

    constructor(props){
        super(props)
        this.state={}
    }
    render() {
        return (
            <div>
                <header>
                 <nav className="navbar navbar-expand-lg" style={{backgroundColor:"#191970"}}>
                  <div className="navbar-brand" style={{color:"white",fontSize:"18pt"}}>Bank Employee Details</div>
                 </nav>
                </header>
            </div>
        );
    }
}

export default HeaderComponent;