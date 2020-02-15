/*eslint-disable import/default */
/*eslint-disable import/namespace */

import React from 'react';
import axios from 'axios';
import HomeBasicInfo from './homeBasicInfo/HomeBasicInfo';
import HomeMainInfo from './homeMainInfo/HomeMainInfo';
import ProfileData from './mock data/profile.json';
import '../../styles/userdetailsmain.css';

class HomePage extends React.Component{

    constructor(props) {
        super(props);
        this.state = {profile: ProfileData}; //using mock, comment this when consuming web service
    }

    // Uncomment this code when we need to access our rest service
    // componentWillMount() {
    //     axios.get(`http://localhost:8080/profile`)
    //       .then(res => {
    //         const profile = res.data;
    //         this.setState({ profile });
    //       });
    //   }

    render(){
        return (
            <div>
                <div className="split left">
                    {/* No need to use redux store for this */}
                    <HomeBasicInfo profile = {this.state.profile} />
                </div>
                <div className="split right">
                    <HomeMainInfo />
                </div>
            </div>
        );
    }
}

export default HomePage;